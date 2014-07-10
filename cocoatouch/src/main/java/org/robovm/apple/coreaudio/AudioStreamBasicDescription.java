/*
 * Copyright (C) 2014 Trillian Mobile AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.coreaudio;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.corefoundation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AudioStreamBasicDescription/*</name>*/ 
    extends /*<extends>*/Struct<AudioStreamBasicDescription>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AudioStreamBasicDescriptionPtr extends Ptr<AudioStreamBasicDescription, AudioStreamBasicDescriptionPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AudioStreamBasicDescription() {}
    public AudioStreamBasicDescription(double mSampleRate, AudioFormat mFormatID, int mFormatFlags, int mBytesPerPacket, int mFramesPerPacket, int mBytesPerFrame, int mChannelsPerFrame, int mBitsPerChannel, int mReserved) {
        this.mSampleRate(mSampleRate);
        this.mFormatID(mFormatID);
        this.mFormatFlags(mFormatFlags);
        this.mBytesPerPacket(mBytesPerPacket);
        this.mFramesPerPacket(mFramesPerPacket);
        this.mBytesPerFrame(mBytesPerFrame);
        this.mChannelsPerFrame(mChannelsPerFrame);
        this.mBitsPerChannel(mBitsPerChannel);
        this.mReserved(mReserved);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native double mSampleRate();
    @StructMember(0) public native AudioStreamBasicDescription mSampleRate(double mSampleRate);
    @StructMember(1) public native AudioFormat mFormatID();
    @StructMember(1) public native AudioStreamBasicDescription mFormatID(AudioFormat mFormatID);
    @StructMember(2) public native int mFormatFlags();
    @StructMember(2) public native AudioStreamBasicDescription mFormatFlags(int mFormatFlags);
    @StructMember(3) public native int mBytesPerPacket();
    @StructMember(3) public native AudioStreamBasicDescription mBytesPerPacket(int mBytesPerPacket);
    @StructMember(4) public native int mFramesPerPacket();
    @StructMember(4) public native AudioStreamBasicDescription mFramesPerPacket(int mFramesPerPacket);
    @StructMember(5) public native int mBytesPerFrame();
    @StructMember(5) public native AudioStreamBasicDescription mBytesPerFrame(int mBytesPerFrame);
    @StructMember(6) public native int mChannelsPerFrame();
    @StructMember(6) public native AudioStreamBasicDescription mChannelsPerFrame(int mChannelsPerFrame);
    @StructMember(7) public native int mBitsPerChannel();
    @StructMember(7) public native AudioStreamBasicDescription mBitsPerChannel(int mBitsPerChannel);
    @StructMember(8) public native int mReserved();
    @StructMember(8) public native AudioStreamBasicDescription mReserved(int mReserved);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
