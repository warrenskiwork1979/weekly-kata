class Palindrome {

  //  def isPalindrome(palindrome: String): Boolean = {
  //    val newPalindrome = palindrome.toLowerCase.replace(" ", "")
  //
  //    if (newPalindrome == newPalindrome.reverse) true else false
  //  }

  def isPalindrome(palindrome: String): Double = {
    val forwardPalindrome = palindrome.toLowerCase.replace(" ", "")
    val reversedPalindrome = forwardPalindrome.reverse

    val y: Seq[Boolean] = for (x <- 0 until forwardPalindrome.length) yield {
      forwardPalindrome.charAt(x) == reversedPalindrome.charAt(x)
    }
    y.count(_ == true).toDouble / forwardPalindrome.length.toDouble * 100

  }
}
