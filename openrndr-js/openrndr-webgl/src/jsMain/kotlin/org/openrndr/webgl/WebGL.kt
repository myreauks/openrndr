import org.khronos.webgl.*
import org.w3c.dom.HTMLImageElement
import org.w3c.dom.ImageData

external interface WebGLRenderingFixedCompressedTexImage {
    fun compressedTexImage2D(
        target: Int,
        level: Int,
        internalformat: Int,
        width: Int,
        height: Int,
        border: Int,
        data: ArrayBufferView?
    )
}

abstract external class WebGL2RenderingContext : WebGLRenderingContext {
    fun bindBufferBase(target: Int, index: Int, buffer: WebGLBuffer?)
    fun bufferData(target: Int, srcData: ArrayBufferView, usage: Int, srcOffset: Int, length: Int)
    fun clearBufferfv(buffer: Int, drawBuffer: Int, values: Float32Array)
    fun drawBuffers(buffers: IntArray)
    fun drawElementsInstanced(mode: Int, count: Int, type: Int, offset: Int, instanceCount: Int)

    fun drawArraysInstanced(mode: Int, first:Int, count:Int, instanceCount: Int)

    fun getActiveUniformBlockParameter(program: WebGLProgram?, uniformBlockIndex: Int, pname: Int): Int
    fun getActiveUniforms(program: WebGLProgram?, uniformIndices: IntArray, pname: Int): IntArray
    fun getUniformBlockIndex(program: WebGLProgram?, uniformBlockName: String): Int
    fun getUniformIndices(program: WebGLProgram?, uniformNames: Array<String>): IntArray
    fun readBuffer(src: Int)
    fun renderbufferStorageMultisample(target: Int, samples: Int, internalformat: Int, width: Int, height: Int)
    fun texImage3D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, depth: Int, border: Int, format: Int, type: Int, srcData: ArrayBufferView?)
    fun texImage3D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, depth: Int, border: Int, format: Int, type: Int, source: HTMLImageElement?)
    fun texSubImage3D(target: Int, level: Int, xoffset: Int, yoffset: Int, zoffset: Int, width: Int, height: Int, depth: Int, format: Int, type: Int, pixels: ImageData?)
    fun texStorage2D(target: Int, levels: Int, internalformat: Int, width: Int, height: Int)
    fun texStorage3D(target: Int, levels: Int, internalformat: Int, width: Int, height: Int, depth: Int)
    fun uniformBlockBinding(program: WebGLProgram?, uniformBlockIndex: Int, uniformBlockBinding: Int)
    fun vertexAttribDivisor(index: Int, divisor: Int)
    fun vertexAttribIPointer(index: Int, size: Int, type: Int, stride: Int, offset: Int)

    companion object {
        val COLOR: Int
        val DEPTH: Int
        val STENCIL: Int
        val DEPTH_STENCIL: Int

        val DEPTH_COMPONENT24: Int
        val DEPTH_COMPONENT32F: Int
        val TEXTURE_3D: Int
        val TEXTURE_WRAP_R: Int
        val TEXTURE_COMPARE_MODE: Int
        val COMPARE_REF_TO_TEXTURE: Int
        val TEXTURE_COMPARE_FUNC: Int

        val UNIFORM_BLOCK_DATA_SIZE: Int
        val UNIFORM_BUFFER: Int
        val UNIFORM_OFFSET: Int

        val INVALID_INDEX: Int

        val RED: Int
        val RG: Int

        val R8: Int
        val RG8: Int
        val RGB8: Int
        val RGBA8: Int

        val R16F: Int
        val RG16F: Int
        val RGB16F: Int
        val RGBA16F: Int
    }
}