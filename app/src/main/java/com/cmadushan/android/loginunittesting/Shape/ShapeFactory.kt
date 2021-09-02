package com.cmadushan.android.loginunittesting.Shape

class ShapeFactory {
  fun getShape(type:String?):Shape? {
    if (type == null) {
      return null
    }
    return when {
      type.equals("CIRCLE", ignoreCase = true) -> {
        Circle()
      }
      type.equals("SQUARE", ignoreCase = true) -> {
        Square()
      }
      type.equals("Rectangle", ignoreCase = true) -> {
        Rectangle()
      }
      else -> null
    }
  }
}