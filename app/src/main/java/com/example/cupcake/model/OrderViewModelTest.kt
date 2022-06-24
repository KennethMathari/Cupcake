package com.example.cupcake.model

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class OrderViewModelTest {

    @Test
    fun cupcakes() {
        val orderViewModel = OrderViewModel()
        orderViewModel.quantity.observeForever {}
        orderViewModel.setQuantity(12)
        assertEquals(12, orderViewModel.quantity.value)
    }

}