(defn factorial
  "Calculate the factorial for a number"
  [n]
  (if (= n 1)
    1
    (* n (factorial (- n 1)))))

(defn sum_digits
  "Sum up the digits of a number"
  [n]
  (reduce
    #(+ %1 %2)
    0
    (map
      #(Integer. (str %))
      (seq (str n)))))

(println (sum_digits (factorial 100)))
