def palindrome(word: String): Boolean = word == word.reverse
println("Enter a word to see if its palindrome or not:")
println(palindrome(readLine()))
