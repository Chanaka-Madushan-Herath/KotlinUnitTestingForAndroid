package com.cmadushan.android.loginunittesting.Shape

import org.hamcrest.core.IsInstanceOf.instanceOf
import org.junit.Assert
import org.junit.Assert.*
import org.junit.Test

class ShapeFactoryTest{

  //Test Object
  @Test
  fun should_return_circle(){
    val shapeFactory = ShapeFactory()
    val shape: Shape? = shapeFactory.getShape("CIRCLE")
    Assert.assertThat(shape, instanceOf(Circle::class.java))
  }
  @Test
  fun should_return_rectangle(){
    val shapeFactory = ShapeFactory()
    val shape: Shape? = shapeFactory.getShape("RECTANGLE")
    Assert.assertThat(shape, instanceOf(Rectangle::class.java))
  }

  @Test
  fun should_return_square(){
    val shapeFactory = ShapeFactory()
    val shape: Shape? = shapeFactory.getShape("SQUARE")
    Assert.assertThat(shape, instanceOf(Square::class.java))
  }

}