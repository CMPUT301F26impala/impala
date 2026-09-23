package com.impala.impala

import kotlin.math.E
import kotlin.math.pow

class LogSpiral(x: Int, y: Int, theta: Int, a: Int, b: Int) : Shape(x, y) {
    val r = a*E.pow(b*theta)
}