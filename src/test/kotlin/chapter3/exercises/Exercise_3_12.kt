package chapter3.exercises

import chapter3.List
import chapter3.solutions.Identity
import io.kotlintest.shouldBe
import io.kotlintest.specs.WordSpec

// tag::init[]
fun <A, B> foldLeftR(xs: List<A>, z: B, f: (B, A) -> B): B = TODO()

fun <A, B> foldRightL(xs: List<A>, z: B, f: (A, B) -> B): B = TODO()
// end::init[]

class Exercise_3_12 : WordSpec({
    "list foldLeftR" should {
        "!implement foldLeft functionality using foldRight" {
            chapter3.solutions.foldLeftR(List.of(1, 2, 3, 4, 5), 0, { x, y -> x + y }) shouldBe 15
        }
    }

    "list foldRightL" should {
        "!implement foldRight functionality using foldLeft" {
            chapter3.solutions.foldRightL(List.of(1, 2, 3, 4, 5), 0, { x, y -> x + y }) shouldBe 15
        }
    }
})