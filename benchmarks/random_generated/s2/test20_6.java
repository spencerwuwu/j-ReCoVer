// Note: only +, - operations
// Parameters:
//   Variables:   20
//   Baselines:   200
//   If-Branches: 20

public void reduce(Text prefix, Iterator<IntWritable> iter,
         OutputCollector<Text, IntWritable> output, Reporter reporter) throws IOException {
int a000 = 0;
int a001 = 0;
int a002 = 0;
int a003 = 0;
int a004 = 0;
int a005 = 0;
int a006 = 0;
int a007 = 0;
int a008 = 0;
int a009 = 0;
int a010 = 0;
int a011 = 0;
int a012 = 0;
int a013 = 0;
int a014 = 0;
int a015 = 0;
int a016 = 0;
int a017 = 0;
int a018 = 0;
int a019 = 0;
int cur = 0;

while (iter.hasNext()) {
cur = iter.next().get();
a004 = a016 + a014;
if (a001 != a017) {
a001 = a005 - a019;
a004 = a006 - a011;
a011 = a017 + a004;
a006 += a017;
if (a002 == a001) {
a014 = a007 - a015;
a012 += a015;
a006 += a002;
a010 = a007 + a009;
a018 = a005 - a009;
} else {
a000 += a013;
a008 += a016;
}
a016 = a010 - a008;
a018 = a008 + a011;
} else {
a013 = -2 - a001;
a004 += a019;
a009 += a017;
a011 += a017;
a012 = a006 - a019;
a017 -= a001;
}
a008 = a017 - a018;
a018 = a011 + a005;
a000 -= a018;
a004 += a003;
a017 = a004 + a011;
a005 = a010 - a019;
a010 = a018 - a019;
if (a006 == a015) {
a002 -= a001;
a004 += a005;
a005 = a004 - a008;
a019 += a002;
if (a000 == a013) {
if (a006 == a009) {
a016 += a001;
a001 = a017 - a005;
a004 += a010;
a011 = a015 - a008;
a004 = 2 + a011;
a012 += a013;
if (a002 <= a000) {
a016 = a016 + a015;
a019 = cur + a016;
a009 = a001 - a003;
a007 -= a017;
a012 -= a002;
a005 -= a011;
} else {
a007 = a007 + a012;
a012 += a002;
a012 += a000;
}
a019 = a007 - cur;
a014 -= a016;
a014 += a008;
a004 = a018 - a002;
a010 += a015;
a017 += a009;
a005 = a018 - a007;
} else {
a004 += a009;
a010 -= a007;
a004 += a003;
a004 += a013;
a002 -= a001;
a015 = a019 + a016;
}
a016 -= a009;
a013 -= a015;
a010 = a004 - a006;
a008 -= a001;
a000 = a004 - a006;
a013 -= a001;
a011 = a006 + a009;
if (a012 >= a009) {
} else {
a012 += a015;
a016 = a006 + a010;
a009 = a000 - a018;
if (cur > a012) {
a011 += a007;
if (a008 > a017) {
a012 = a000 - a013;
a017 -= a016;
a014 -= a007;
a007 = a010 - a019;
a013 += a018;
a017 = a016 - a014;
a009 -= a007;
} else {
a001 = a004 - a012;
a015 = a008 - a013;
a018 = a005 + a004;
a018 = a003 - a000;
a000 = a017 + a005;
}
a005 = a005 - a015;
a012 += a005;
if (a013 > a019) {
} else {
a019 += a013;
a006 = a019 - a010;
a014 -= a001;
}
a010 = a005 - a018;
a002 = a019 + 0;
cur -= a001;
a014 -= a016;
a006 = a019 * 4;
a001 += a017;
a013 = a011 + a018;
} else {
a002 += a002;
if (a016 != a006) {
a005 -= a005;
a019 += a016;
a012 = a015 + a004;
a001 = a003 - a000;
a016 = a009 - a001;
a008 = a007 + a014;
a015 += a004;
} else {
a003 -= a019;
a014 -= a011;
a000 = cur + a009;
a002 = a000 - a016;
cur = a001 - a014;
if (a003 != cur) {
a011 = a004 - a009;
a018 = a013 - a015;
a003 = a004 + a018;
cur = a004 + a012;
a007 += a015;
a004 -= a002;
if (a010 >= cur) {
a019 -= a007;
a008 = a012 - a002;
a003 = a005 - a001;
a008 = a001 + a014;
if (a012 >= a014) {
cur += -2;
a017 = a000 - a018;
a009 -= a002;
a013 = a005 + a012;
a014 = a010 - a004;
} else {
a003 -= a013;
a011 = a016 - a008;
a019 -= a011;
a007 = a003 - 2;
}
a014 = a014 + a011;
a004 = a018 + a018;
a001 = a017 - a003;
a005 -= a015;
} else {
a018 -= a004;
}
a015 -= a005;
a004 += -5;
a014 = a013 + a016;
a000 += a006;
a010 -= a010;
a005 += a011;
a006 = a010 * -3;
} else {
}
a019 += a010;
a017 += a017;
if (a015 != a019) {
a010 += a001;
} else {
a018 = a017 - a011;
a016 = a014 + a002;
a004 -= a003;
a000 = a006 + a009;
if (a003 > a014) {
} else {
}
a012 = a002 - a008;
}
if (a008 >= a017) {
a016 = a008 - a006;
a016 = -5 + a002;
if (a007 != a003) {
a019 = a005 + a000;
a017 -= a004;
if (a002 >= a017) {
a009 = a005 - a012;
a004 = a015 - a002;
if (a004 > a001) {
a007 = 1 - a003;
} else {
a010 -= a009;
a005 = a010 - a003;
a010 -= a007;
a003 = a003 + a017;
a014 = a007 + a001;
}
a010 = a003 - a008;
a014 = a000 - a012;
a013 = a014 - a009;
a019 = a007 - a012;
a010 = a006 - a002;
} else {
a000 -= a004;
a004 -= a003;
a005 = a000 - a010;
}
} else {
a006 = a013 + a007;
}
a010 += a010;
a003 += a009;
a007 = a006 + a015;
a017 = a004 - a012;
a002 = a006 + a002;
a007 = cur - a004;
} else {
a011 -= a011;
a001 -= a006;
a016 = a007 - a004;
cur = -1 + a017;
a016 -= a015;
}
a016 -= a012;
a007 += a009;
a015 = a003 + a005;
a000 = a006 + a010;
a017 = a003 + cur;
a011 += a005;
a002 = a017 + a006;
}
a016 -= a006;
a010 = a009 - 3;
a018 = a008 + a016;
a003 += a003;
a015 = a019 - a003;
a003 -= -2;
}
a011 -= a011;
a006 = a004 + a003;
a009 -= a019;
a003 = a000 - a016;
a008 -= a011;
a006 = -2 + a009;
}
a017 -= a005;
a017 = a003 + a019;
} else {
}
} else {
}
a006 += a003;
}
output.collect(prefix, new IntWritable(a015));
}