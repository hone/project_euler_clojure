(load-file "solutions/prime.clj")

(println
  (reduce
    #(+ %1 %2)
    (prime 2000000)))
