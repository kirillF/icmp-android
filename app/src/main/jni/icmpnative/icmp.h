//
// Created by kirillf on 5/20/16.
//

#ifndef ICMPTEST_ICMP_H
#define ICMPTEST_ICMP_H

#include <jni.h>

JNIEXPORT jint JNICALL Java_com_github_kirillf_icmptest_MainActivity_pingJNI(
        JNIEnv *, jobject, jstring, jint);

#endif //ICMPTEST_ICMP_H
