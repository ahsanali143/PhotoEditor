package com.advance.photoeditor.filters

import ja.advance.photoeditor.PhotoFilter

interface FilterListener {
    fun onFilterSelected(photoFilter: PhotoFilter?)
}