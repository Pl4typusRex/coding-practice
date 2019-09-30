def get_grade(s1, s2, s3)
 
 score = (s1 + s2 + s3) / 3
 grade = ""
 
 if score < 60
   grade = "F"
 elsif score >= 60 && score < 70
   grade = "D"
 elsif score >= 70 && score < 80
   grade = "C"
 elsif score >= 80 && score < 90
   grade = "B"
 elsif score > 90
   grade = "A"
 end
 
 return grade
 
end
