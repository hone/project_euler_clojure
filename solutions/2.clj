(load-file "solutions/fibonacci.clj")

(defn sum_even_fib
  "sum of all the even fib numbers up to x"
  [x]
  (reduce
    #(+ %1 %2)
    (filter even?
            (take-while #(< % x) (fib)))))

(println (str "Sum up to 10: " (sum_even_fib 10)))
(println (str "Sum up to 4000000: " (sum_even_fib 4000000)))
