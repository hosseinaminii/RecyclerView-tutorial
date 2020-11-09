package ir.apptori.recyclerviewtutotiral

import android.graphics.drawable.Drawable

/**
 * Created by hosseinAmini.
 * Email: hosseinamiinii@gmail.com
 */

sealed class Model

data class TypeAModel(val image: Drawable, val text: String) : Model()

data class TypeBModel(val image: Drawable) : Model()