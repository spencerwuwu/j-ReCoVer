#!/usr/bin/python2.7
import os
from subprocess import Popen, PIPE
import time
import sys

Path = "reducers/target/New-1.0.jar"
Max_time = 5

def z3():
    global_path = sys.argv[1]
    z3_f = open(global_path + "z3Format.txt", "a");
    z3_f.write("\n(get-model)\n");
    print os.popen("z3 z3Format.txt").read()


def parse_output(result):
    for line in result.splitlines():
        if "RESULT" in line:
            print line
            if "NOT" in line:
                z3()


def wait_timeout(proc, seconds):
    start = time.time()
    end = start + seconds
    interval = .25
    while True:
        result = proc.poll()
        if result is not None:
            parse_output(proc.communicate()[0])
            return result
        if time.time() >= end:
            proc.kill()
            print "_TIMEOUT_"
            return result
        time.sleep(interval)


def main():
    global_path = sys.argv[1]
    cmd = ["java", "-jar", global_path + "jsr.jar", global_path + Path, "autoGenerator"]
    run = Popen(cmd, stdout=PIPE)
    result = wait_timeout(run, Max_time)


if __name__ == "__main__":
    if (len(sys.argv) != 2):
        print "Interal Error"
    else:
        main()

