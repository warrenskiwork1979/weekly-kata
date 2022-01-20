import org.scalatestplus.play.PlaySpec

class PalindromeSpec extends PlaySpec {

  "palindrome" should {

    val palindrome = new Palindrome()

    "must return false when palindrome string is not a match" in {

      val falsePalindrome = "rest"

      val result = palindrome.isPalindrome(falsePalindrome)

      result mustBe 0
    }

    "must return an Integer value equal to 100 when palindrome string is a match" in {

      val truePalindrome = "radar"

      val result = palindrome.isPalindrome(truePalindrome)

      result mustBe 100
    }

    "must return true when palindrome for any string that is a match" in {

      val testPalindrome = "hannah"

      val result = palindrome.isPalindrome(testPalindrome)

      result mustBe 100
    }

    "must return true if matched palindrome string contains spaces" in {

      val testSpacePalindrome = "race car"

      val result = palindrome.isPalindrome(testSpacePalindrome)

      result mustBe 100
    }

    "must return true if matched palindrome string contains capital letters" in {

      val testCapitalsPalindrome = "rAce caR"

      val result = palindrome.isPalindrome(testCapitalsPalindrome)

      result mustBe 100
    }

    "must return the correct percentage amount of the chars of the total palindrome string length that match" in {

      val testPalindrome = "radas"

      val result = palindrome.isPalindrome(testPalindrome)

      result mustBe 60.0
    }
  }
}
