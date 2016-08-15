LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)

LOCAL_MODULE := gpuimage-library
LOCAL_LDFLAGS := -Wl,--build-id
LOCAL_LDLIBS := \
	-llog \

LOCAL_SRC_FILES := \
	/Users/jch/Documents/workcSpace/android/appRtc_v50/library/jni/yuv-decoder.c \

LOCAL_C_INCLUDES += /Users/jch/Documents/workcSpace/android/appRtc_v50/library/jni
LOCAL_C_INCLUDES += /Users/jch/Documents/workcSpace/android/appRtc_v50/library/src/release/jni

include $(BUILD_SHARED_LIBRARY)
