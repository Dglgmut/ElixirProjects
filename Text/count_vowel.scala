println("Enter a string")
val vowel: List[Char] = List('a', 'e', 'i', 'o', 'u')
println(readLine().toCharArray.filter{l => vowel.exists(l == _)}.length)
