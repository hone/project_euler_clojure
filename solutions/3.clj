(load-file "solutions/prime.clj")

(defn prime_factors
  [number]
  (filter #(= (rem number %) 0) (prime (Math/sqrt number))))

(println (peek (vec (prime_factors 13195))))
(println (peek (vec (prime_factors 600851475143))))
