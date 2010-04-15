(defn fib
  "fibonacci sequence"
  ;base case
  ([]
   (concat [1] (fib 0 1)))

  ([a b]
   (let [n (+ a b)]
     (lazy-seq
       (cons n (fib b n))))))
