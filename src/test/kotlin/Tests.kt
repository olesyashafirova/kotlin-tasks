import org.junit.Assert.assertEquals
import org.junit.Test

class Tests {

    @Test
    fun сортировкаПоВозрастанию1() {
        assertEquals(listOf(1,2,3), listOf(1,2,3).поВозрастанию())
    }

    @Test
    fun сортировкаПоВозрастанию2() {
        assertEquals(listOf(1,1,1), listOf(1,1,1).поВозрастанию())
    }

    @Test
    fun сортировкаПоВозрастанию3() {
        assertEquals(listOf(1,2,3), listOf(3,2,1).поВозрастанию())
    }

    @Test
    fun сортировкаПоВозрастанию4() {
        assertEquals(listOf(1,2,3,3,4,5), listOf(3,2,3,1,5,4).поВозрастанию())
    }
}