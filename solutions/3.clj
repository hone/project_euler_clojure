(defn prime
  "Sieve of Eratosthenes"
  ([n]
   (prime n 2 (set (range 2 (+ n 1)))))
  ([n p prime_list]
   (let [p_squared (* p p)]
     (if (> p_squared n)
       (sort prime_list)
       (let [after_p_squared (filter #(>= % p_squared) prime_list)
             removed_numbers (filter #(= (rem % p) 0) after_p_squared)
             new_prime_list (clojure.set/difference prime_list removed_numbers)
             next_p (some #(if (> % p) % false) (sort new_prime_list))]
         (recur n next_p new_prime_list))))))

(defn prime_factors
  [number]
  (filter #(= (rem number %) 0) (prime (Math/sqrt number))))

(println (peek (vec (prime_factors 13195))))
(println (peek (vec (prime_factors 600851475143))))
