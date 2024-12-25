package com.rhouma.androidbasicsworkmanager

import android.graphics.Bitmap
import android.net.Uri
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import java.util.UUID

class PhotoViewModel : ViewModel() {

    var uncompressedUri: Uri? by mutableStateOf(null)
        private set

    var compressedBitmap: Bitmap? by mutableStateOf(null)
        private set

    var workId: UUID? by mutableStateOf(null)
        private set

    fun updateUnCompressUri(uri: Uri?) {
        uncompressedUri = uri
    }

    fun updateCompressedBitmap(bitmap: Bitmap?) {
        compressedBitmap = bitmap
    }

    fun updateWorkId(uuid: UUID?) {
        workId = uuid
    }
}