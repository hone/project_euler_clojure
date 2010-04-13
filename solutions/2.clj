(defn fib
  "fibonacci sequence"
  ;base case
  ([]
   (concat [0 1] (fib 0 1)))

  ([a b]
   (let [n (+ a b)]
     (lazy-seq
       (cons n (fib b n))))))

(defn sum_even_fib
  "sum of all the even fib numbers up to x"
  [x]
  (reduce
    #(+ %1 %2)
    (filter even?
            (take-while #(< % x) (fib)))))

(println (str "Sum up to 10: " (sum_even_fib 10)))
(println (str "Sum up to 4000000: " (sum_even_fib 4000000)))
