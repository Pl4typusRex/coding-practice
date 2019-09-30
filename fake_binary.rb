def fake_bin(s)

 binary = []

  s.chars.each do |c|
    if c < '5'
      binary.push('0')
    else
      binary.push('1')
    end
  end
  
  return binary.join("")
  
end
