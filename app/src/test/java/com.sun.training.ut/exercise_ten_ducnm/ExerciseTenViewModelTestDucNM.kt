package com.sun.training.ut.exercise_ten_ducnm

import android.content.Context
import android.content.res.Resources
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.sun.training.ut.R
import com.sun.training.ut.exercise_ten.data.model.Invoice
import com.sun.training.ut.exercise_ten.domain.business.DiscountBusiness.UNKNOWN_CLASS_DISCOUNT_PERCENT
import com.sun.training.ut.exercise_ten.domain.business.PaymentAmountPointBusiness.PAYMENT_10K
import com.sun.training.ut.exercise_ten.ui.ExerciseTenViewModel
import junit.framework.Assert.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestRule
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.MockitoAnnotations
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class ExerciseTenViewModelTestDucNM {
    @get:Rule
    var rule: TestRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var mockResources: Resources

    @Mock
    private lateinit var mockContext: Context

    private lateinit var viewModel: ExerciseTenViewModel

    @Before
    @Throws(Exception::class)
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        `when`(mockContext.resources).thenReturn(mockResources)

        `when`(mockResources.getString(R.string.ex_10_class_type_unknown)).thenReturn("Không phải hội viên")
        viewModel = ExerciseTenViewModel(mockResources)
    }

//    //1
//    @Test
//    fun validateInvoice_Silver3k_return1Discount() {
//        validateCommonTest(
//            PAYMENT_3K,
//            SILVER_CLASS_MIN_3K_DISCOUNT_PERCENT,
//            R.string.ex_10_class_type_silver,
//            false
//        )
//        viewModel.updateMemberClassType(
//                mockContext.resources.getString(classTypeRes)
//                )
//        viewModel.subTotal.value = payment.toString()
//        viewModel.printInvoice()
//        assertEquals(
//            Invoice(
//                invoiceId = 1,
//                subTotal = payment,
//                discount = payment * discount,
//                giftAccepted = isGift,
//                total = payment - payment * discount
//            ), viewModel.invoice.value
//        )
//    }
//
//    //2
//    @Test
//    fun validateInvoice_Silver5k_HaveGift_return2Discount_Gift() {
//        validateCommonTest(
//            PAYMENT_5K,
//            SILVER_CLASS_MIN_5K_DISCOUNT_PERCENT,
//            R.string.ex_10_class_type_silver,
//            true
//        )
//        viewModel.updateMemberClassType(
//            mockContext.resources.getString(classTypeRes)
//        )
//        viewModel.subTotal.value = payment.toString()
//        viewModel.printInvoice()
//        assertEquals(
//            Invoice(
//                invoiceId = 1,
//                subTotal = payment,
//                discount = payment * discount,
//                giftAccepted = isGift,
//                total = payment - payment * discount
//            ), viewModel.invoice.value
//        )
//    }
//
//    //3
//    @Test
//    fun validateInvoice_Silver5k_NotGift_return2Discount() {
//        validateCommonTest(
//            PAYMENT_5K,
//            SILVER_CLASS_MIN_5K_DISCOUNT_PERCENT,
//            R.string.ex_10_class_type_silver,
//            false
//        )
//        viewModel.updateMemberClassType(
//            mockContext.resources.getString(classTypeRes)
//        )
//        viewModel.subTotal.value = payment.toString()
//        viewModel.printInvoice()
//        assertEquals(
//            Invoice(
//                invoiceId = 1,
//                subTotal = payment,
//                discount = payment * discount,
//                giftAccepted = isGift,
//                total = payment - payment * discount
//            ), viewModel.invoice.value
//        )
//    }
//
//    //4
//    @Test
//    fun validateInvoice_Silver10k_HaveGift_return4Discount_Gift() {
//        validateCommonTest(
//            PAYMENT_10K,
//            SILVER_CLASS_MIN_10K_DISCOUNT_PERCENT,
//            R.string.ex_10_class_type_silver,
//            true
//        )
//        viewModel.updateMemberClassType(
//            mockContext.resources.getString(classTypeRes)
//        )
//        viewModel.subTotal.value = payment.toString()
//        viewModel.printInvoice()
//        assertEquals(
//            Invoice(
//                invoiceId = 1,
//                subTotal = payment,
//                discount = payment * discount,
//                giftAccepted = isGift,
//                total = payment - payment * discount
//            ), viewModel.invoice.value
//        )
//    }
//
//    //5
//    @Test
//    fun validateInvoice_Silver10k_NotGift_return4Discount() {
//        validateCommonTest(
//            PAYMENT_10K,
//            SILVER_CLASS_MIN_10K_DISCOUNT_PERCENT,
//            R.string.ex_10_class_type_silver,
//            false
//        )
//        viewModel.updateMemberClassType(
//            mockContext.resources.getString(classTypeRes)
//        )
//        viewModel.subTotal.value = payment.toString()
//        viewModel.printInvoice()
//        assertEquals(
//            Invoice(
//                invoiceId = 1,
//                subTotal = payment,
//                discount = payment * discount,
//                giftAccepted = isGift,
//                total = payment - payment * discount
//            ), viewModel.invoice.value
//        )
//    }
//
//    //6
//    @Test
//    fun validateInvoice_Gold3k_return3Discount() {
//        validateCommonTest(
//            PAYMENT_3K,
//            GOLD_CLASS_MIN_3K_DISCOUNT_PERCENT,
//            R.string.ex_10_class_type_gold,
//            false
//        )
//        viewModel.updateMemberClassType(
//            mockContext.resources.getString(classTypeRes)
//        )
//        viewModel.subTotal.value = payment.toString()
//        viewModel.printInvoice()
//        assertEquals(
//            Invoice(
//                invoiceId = 1,
//                subTotal = payment,
//                discount = payment * discount,
//                giftAccepted = isGift,
//                total = payment - payment * discount
//            ), viewModel.invoice.value
//        )
//    }
//
//    //7
//    @Test
//    fun validateInvoice_Gold5k_HaveGift_return5Discount_Gift() {
//        validateCommonTest(
//            PAYMENT_5K,
//            GOLD_CLASS_MIN_5K_DISCOUNT_PERCENT,
//            R.string.ex_10_class_type_gold,
//            true
//        )
//        viewModel.updateMemberClassType(
//            mockContext.resources.getString(classTypeRes)
//        )
//        viewModel.subTotal.value = payment.toString()
//        viewModel.printInvoice()
//        assertEquals(
//            Invoice(
//                invoiceId = 1,
//                subTotal = payment,
//                discount = payment * discount,
//                giftAccepted = isGift,
//                total = payment - payment * discount
//            ), viewModel.invoice.value
//        )
//    }
//
//    //8
//    @Test
//    fun validateInvoice_Gold5k_NotGift_return5Discount() {
//        validateCommonTest(
//            PAYMENT_5K,
//            GOLD_CLASS_MIN_5K_DISCOUNT_PERCENT,
//            R.string.ex_10_class_type_gold,
//            false
//        )
//        viewModel.updateMemberClassType(
//            mockContext.resources.getString(classTypeRes)
//        )
//        viewModel.subTotal.value = payment.toString()
//        viewModel.printInvoice()
//        assertEquals(
//            Invoice(
//                invoiceId = 1,
//                subTotal = payment,
//                discount = payment * discount,
//                giftAccepted = isGift,
//                total = payment - payment * discount
//            ), viewModel.invoice.value
//        )
//    }
//
//    //9
//    @Test
//    fun validateInvoice_Gold10k_HaveGift_return10Discount_Gift() {
//        validateCommonTest(
//            PAYMENT_10K,
//            GOLD_CLASS_MIN_10K_DISCOUNT_PERCENT,
//            R.string.ex_10_class_type_gold,
//            true
//        )
//        viewModel.updateMemberClassType(
//            mockContext.resources.getString(classTypeRes)
//        )
//        viewModel.subTotal.value = payment.toString()
//        viewModel.printInvoice()
//        assertEquals(
//            Invoice(
//                invoiceId = 1,
//                subTotal = payment,
//                discount = payment * discount,
//                giftAccepted = isGift,
//                total = payment - payment * discount
//            ), viewModel.invoice.value
//        )
//    }
//
//    //10
//    @Test
//    fun validateInvoice_Gold10k_NotGift_return10Discount() {
//        validateCommonTest(
//            PAYMENT_10K,
//            GOLD_CLASS_MIN_10K_DISCOUNT_PERCENT,
//            R.string.ex_10_class_type_gold,
//            false
//        )
//        viewModel.updateMemberClassType(
//            mockContext.resources.getString(classTypeRes)
//        )
//        viewModel.subTotal.value = payment.toString()
//        viewModel.printInvoice()
//        assertEquals(
//            Invoice(
//                invoiceId = 1,
//                subTotal = payment,
//                discount = payment * discount,
//                giftAccepted = isGift,
//                total = payment - payment * discount
//            ), viewModel.invoice.value
//        )
//    }
//
//    //11
//    @Test
//    fun validateInvoice_Black3k_return3Discount() {
//        validateCommonTest(
//            PAYMENT_3K,
//            BLACK_CLASS_MIN_3K_DISCOUNT_PERCENT,
//            R.string.ex_10_class_type_black,
//            false
//        )
//        viewModel.updateMemberClassType(
//            mockContext.resources.getString(classTypeRes)
//        )
//        viewModel.subTotal.value = payment.toString()
//        viewModel.printInvoice()
//        assertEquals(
//            Invoice(
//                invoiceId = 1,
//                subTotal = payment,
//                discount = payment * discount,
//                giftAccepted = isGift,
//                total = payment - payment * discount
//            ), viewModel.invoice.value
//        )
//    }
//
//    //12
//    @Test
//    fun validateInvoice_Black5k_HaveGift_return7Discount_Gift() {
//        validateCommonTest(
//            PAYMENT_5K,
//            BLACK_CLASS_MIN_5K_DISCOUNT_PERCENT,
//            R.string.ex_10_class_type_black,
//            true
//        )
//        viewModel.updateMemberClassType(
//            mockContext.resources.getString(classTypeRes)
//        )
//        viewModel.subTotal.value = payment.toString()
//        viewModel.printInvoice()
//        assertEquals(
//            Invoice(
//                invoiceId = 1,
//                subTotal = payment,
//                discount = payment * discount,
//                giftAccepted = isGift,
//                total = payment - payment * discount
//            ), viewModel.invoice.value
//        )
//    }
//
//    //13
//    @Test
//    fun validateInvoice_Black5k_NotGift_return7Discount() {
//        validateCommonTest(
//            PAYMENT_5K,
//            BLACK_CLASS_MIN_5K_DISCOUNT_PERCENT,
//            R.string.ex_10_class_type_black,
//            false
//        )
//        viewModel.updateMemberClassType(
//            mockContext.resources.getString(classTypeRes)
//        )
//        viewModel.subTotal.value = payment.toString()
//        viewModel.printInvoice()
//        assertEquals(
//            Invoice(
//                invoiceId = 1,
//                subTotal = payment,
//                discount = payment * discount,
//                giftAccepted = isGift,
//                total = payment - payment * discount
//            ), viewModel.invoice.value
//        )
//    }
//
//    //14
//    @Test
//    fun validateInvoice_Black10k_HaveGift_return15Discount_Gift() {
//        validateCommonTest(
//            PAYMENT_10K,
//            BLACK_CLASS_MIN_10K_DISCOUNT_PERCENT,
//            R.string.ex_10_class_type_black,
//            true
//        )
//        viewModel.updateMemberClassType(
//            mockContext.resources.getString(classTypeRes)
//        )
//        viewModel.subTotal.value = payment.toString()
//        viewModel.printInvoice()
//        assertEquals(
//            Invoice(
//                invoiceId = 1,
//                subTotal = payment,
//                discount = payment * discount,
//                giftAccepted = isGift,
//                total = payment - payment * discount
//            ), viewModel.invoice.value
//        )
//    }
//
//    //15
//    @Test
//    fun validateInvoice_Black10k_NotGift_return15Discount() {
//        validateCommonTest(
//            PAYMENT_10K,
//            BLACK_CLASS_MIN_10K_DISCOUNT_PERCENT,
//            R.string.ex_10_class_type_black,
//            false
//        )
//        viewModel.updateMemberClassType(
//            mockContext.resources.getString(classTypeRes)
//        )
//        viewModel.subTotal.value = payment.toString()
//        viewModel.printInvoice()
//        assertEquals(
//            Invoice(
//                invoiceId = 1,
//                subTotal = payment,
//                discount = payment * discount,
//                giftAccepted = isGift,
//                total = payment - payment * discount
//            ), viewModel.invoice.value
//        )
//    }
//
//    //16
//    @Test
//    fun validateInvoice_Unknown3k_returnNothing() {
//        validateCommonTest(
//            PAYMENT_3K,
//            UNKNOWN_CLASS_DISCOUNT_PERCENT,
//            R.string.ex_10_class_type_unknown,
//            false
//        )
//        viewModel.updateMemberClassType(
//            mockContext.resources.getString(classTypeRes)
//        )
//        viewModel.subTotal.value = payment.toString()
//        viewModel.printInvoice()
//        assertEquals(
//            Invoice(
//                invoiceId = 1,
//                subTotal = payment,
//                discount = payment * discount,
//                giftAccepted = isGift,
//                total = payment - payment * discount
//            ), viewModel.invoice.value
//        )
//    }
//
//    //17
//    @Test
//    fun validateInvoice_Unknown5k_HaveGift_returnGift() {
//        validateCommonTest(
//            PAYMENT_5K,
//            UNKNOWN_CLASS_DISCOUNT_PERCENT,
//            R.string.ex_10_class_type_unknown,
//            true
//        )
//        viewModel.updateMemberClassType(
//            mockContext.resources.getString(classTypeRes)
//        )
//        viewModel.subTotal.value = payment.toString()
//        viewModel.printInvoice()
//        assertEquals(
//            Invoice(
//                invoiceId = 1,
//                subTotal = payment,
//                discount = payment * discount,
//                giftAccepted = isGift,
//                total = payment - payment * discount
//            ), viewModel.invoice.value
//        )
//    }
//
//    //18
//    @Test
//    fun validateInvoice_Unknown5k_NotGift_returnNothing() {
//        validateCommonTest(
//            PAYMENT_5K,
//            UNKNOWN_CLASS_DISCOUNT_PERCENT,
//            R.string.ex_10_class_type_unknown,
//            false
//        )
//        viewModel.updateMemberClassType(
//            mockContext.resources.getString(classTypeRes)
//        )
//        viewModel.subTotal.value = payment.toString()
//        viewModel.printInvoice()
//        assertEquals(
//            Invoice(
//                invoiceId = 1,
//                subTotal = payment,
//                discount = payment * discount,
//                giftAccepted = isGift,
//                total = payment - payment * discount
//            ), viewModel.invoice.value
//        )
//    }
//
//    //19
//    @Test
//    fun validateInvoice_Unknown10k_HaveGift_returnGift() {
//        validateCommonTest(
//            PAYMENT_10K,
//            UNKNOWN_CLASS_DISCOUNT_PERCENT,
//            R.string.ex_10_class_type_unknown,
//            true
//        )
//
//        viewModel.updateMemberClassType(
//            mockContext.resources.getString(classTypeRes)
//        )
//        viewModel.subTotal.value = payment.toString()
//        viewModel.printInvoice()
//        assertEquals(
//            Invoice(
//                invoiceId = 1,
//                subTotal = payment,
//                discount = payment * discount,
//                giftAccepted = isGift,
//                total = payment - payment * discount
//            ), viewModel.invoice.value
//        )
//    }

    //20
    @Test
    fun validateInvoice_Unknown10k_NotGift_returnNothing() {
        validateCommonTest(
            PAYMENT_10K,
            UNKNOWN_CLASS_DISCOUNT_PERCENT,
            R.string.ex_10_class_type_unknown,
            false
        )
//        viewModel.updateMemberClassType(mockContext.resources.getString(R.string.ex_10_class_type_unknown))
//        viewModel.subTotal.value = PAYMENT_10K.toString()
//        viewModel.printInvoice()
//        assertEquals(
//            Invoice(
//                invoiceId = 1,
//                subTotal = PAYMENT_10K,
//                discount = PAYMENT_10K * UNKNOWN_CLASS_DISCOUNT_PERCENT,
//                giftAccepted = false,
//                total = PAYMENT_10K - PAYMENT_10K * UNKNOWN_CLASS_DISCOUNT_PERCENT
//            ), viewModel.invoice.value
//        )
    }

    private fun validateCommonTest(
        payment: Double,
        discount: Double,
        classTypeRes: Int,
        isGift: Boolean
    ) {
        viewModel.updateMemberClassType(
            mockContext.resources.getString(classTypeRes)
        )
        viewModel.subTotal.value = payment.toString()
        viewModel.printInvoice()
        assertEquals(
            Invoice(
                invoiceId = 1,
                subTotal = payment,
                discount = payment * discount,
                giftAccepted = isGift,
                total = payment - payment * discount
            ), viewModel.invoice.value
        )
    }
}