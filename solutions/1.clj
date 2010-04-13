(defn sum_of_multiples_of_3_and_5
  "sum of all numbers under x which are multiples of 3 and 5"
  [x]
  (reduce
    #(+ %1 %2)
    0
    (filter
      #(or
         (= 0 (rem % 3))
         (= 0 (rem % 5)))
      (range 1 x))))

(println (str "Sum up to 10: " (sum_of_multiples_of_3_and_5 10)))
(println (str "Sum up to 1000: " (sum_of_multiples_of_3_and_5 1000)))
