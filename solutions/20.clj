(defn factorial
  "Calculate the factorial for a number"
  ([n]
   (factorial n 1))
  ([n acc]
   (if (= n 1)
     acc
     (recur (dec n) (* acc n)))))

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
