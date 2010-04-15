(load-file "solutions/fibonacci.clj")

(defn first_fib_term_by_length
  "Return the first fibonacci term with length n"
  [n]
  (inc (count
         (take-while
           #(< (.length (str %)) n)
           (fib)))))

(println (first_fib_term_by_length 1000))
