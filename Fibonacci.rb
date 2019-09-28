puts "This will calculate the first x numbers of the Fibonacci sequence\n"
puts "Please enter a number: "
nth_term = gets.chomp
nth_term = nth_term.to_i

sequence = [0,1]

(1..nth_term).each do

  point_1 = sequence[sequence.length()-2]
  point_2 = sequence[sequence.length()-1]

  x = point_1 + point_2
  sequence.push(x)

end

puts "#{sequence}"
