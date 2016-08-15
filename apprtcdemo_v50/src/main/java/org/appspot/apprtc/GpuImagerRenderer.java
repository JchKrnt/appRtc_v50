package org.appspot.apprtc;

import android.graphics.PointF;
import android.opengl.GLES20;

import org.webrtc.VideoRenderer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

import jp.co.cyberagent.android.gpuimage.GPUImageFilter;
import jp.co.cyberagent.android.gpuimage.GPUImageVignetteFilter;
import static jp.co.cyberagent.android.gpuimage.util.TextureRotationUtil.TEXTURE_NO_ROTATION;


/**
 * Created by jch on 16/8/5.
 */
public class GpuImagerRenderer implements VideoRenderer.Callbacks{

    private FloatBuffer mGLCubeBuffer;
    private FloatBuffer mGLTextureBuffer;
    private GPUImageFilter mImageFilter;
    static final float CUBE[] = {
            -1.0f, -1.0f,
            1.0f, -1.0f,
            -1.0f, 1.0f,
            1.0f, 1.0f,
    };

    public GpuImagerRenderer() {
//        mGLCubeBuffer = ByteBuffer.allocateDirect(CUBE.length * 4)
//                .order(ByteOrder.nativeOrder())
//                .asFloatBuffer();
//        mGLCubeBuffer.put(CUBE).position(0);
//
//        mGLTextureBuffer = ByteBuffer.allocateDirect(TEXTURE_NO_ROTATION.length * 4)
//                .order(ByteOrder.nativeOrder())
//                .asFloatBuffer();
//        PointF centerPoint = new PointF();
//        centerPoint.x = 0.5f;
//        centerPoint.y = 0.5f;
//        mImageFilter = new GPUImageVignetteFilter(centerPoint, new float[] {0.0f, 0.0f, 0.0f}, 0.3f, 0.75f);
//        mImageFilter.init();
//        GLES20.glUseProgram(mImageFilter.getProgram());

    }

    @Override
    public void renderFrame(VideoRenderer.I420Frame frame) {

//        for(int i = 0 ; i < frame.height / 2 ; ++ i){
//            memset((void*)(frame.uPlane +  i * frame.uPitch), 128, frame.width / 2);
//            memset((void*)(frame.vPlane + i * frame.vPitch), 128, frame.width / 2);
//        }

//        for (int i = 0; i < frame.height / 2; ++i){
//
//            for (int j = 0; j <= frame.width/2; ++j){
//                frame.yuvPlanes[j] = frame.yuvPlanes[j] + i*frame.yuvPlanes[j];
//            }
//        }


//        for (int i=0; i<3; ++i){
//
//            frame.yuvPlanes[i].putInt(90);
//        }

//        mImageFilter.onOutputSizeChanged(frame.width, frame.height);
//        mImageFilter.onDraw(frame.textureId, mGLCubeBuffer, mGLTextureBuffer);


    }
}
