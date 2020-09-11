;;;;;; -*- Mode: Lisp -*-

;;;;;; nfa.lisp

;;;;;; Membri del gruppo:
;;;;;; Paini Matteo          Matricola: 829917
;;;;;; Quaini Giacomo Maria  Matricola: 830593
;;;;;; Sancini Tommaso       Matricola: 833304
;


;;;is-regexp/1
(defun is-regexp (re)
  (cond ((atom re) T)
        ((and (> (length re) 2) 
              (eql (first re) 'seq)) 
         (list-ex (rest re)))
        ((and (> (length re) 2) 
              (eql (first re) 'or)) 
         (list-ex (rest re)))
        ((and (= (length re) 2) 
              (eql (first re) 'star)) 
         (list-ex (rest re)))
        ((and (= (length re) 2) 
              (eql (first re) 'plus)) 
         (list-ex (rest re)))
        ((and (not(eql(first re) 'star)) 
              (not(eql(first re) 'seq)) 
              (not(eql(first re) 'or)) 
              (not(eql(first re) 'plus))) T))) 

                               
;;;list-ex/1
(defun list-ex (re)
  (cond ((atom re) T)
        (T  (and (is-regexp (first re)) 
                 (list-ex (rest re))))))


;;;nfa-regexp-comp/1
(defun nfa-regexp-comp (re)
  (cond ((atom re) 
         (list '(initial 0) (list 'delta 0 re -1) '(final -1)))
        ((and (not(eql(first re) 'star)) 
              (not(eql(first re) 'seq)) 
              (not(eql(first re) 'or)) 
              (not(eql(first re) 'plus)))
         (list '(initial 0) (list 'delta 0 re -1) '(final -1)))
        ((is-regexp re)
         (append (list '(initial 0)) (nfa-subregexp-comp re nil 0 0)))))


;;;nfa-subregexp-comp/4
(defun nfa-subregexp-comp (re res i f)
  (cond ((and(eql re nil)(eql res nil)) 
         (append (list(list 'delta i 'epsilon -1))
                 (list(list 'final -1))))
        ((and(eql re nil) (not(eql res nil))) '())
        ((eql (first re) 'seq) 
         (create-seq (rest re) res i f)) 
        ((eql (first re) 'or) 
         (create-or (rest re) res i f))
        ((eql (first re) 'star) 
         (create-star (rest re) res i f))
        ((eql (first re) 'plus) 
         (create-plus (rest re) res i f))))


;;;create-seq/4
(defun create-seq (re res i f)
  (cond ((and (eql re nil) (eql res nil)) 
         (append (list(list 'delta i 'epsilon (+ f 1)))
                 (nfa-subregexp-comp re res (+ f 1) (+ f 1))))
        ((and (eql re nil) (not(eql res nil))) 
         (list(list 'delta i 'epsilon (+ f 1))))
        ((atom (first re)) 
         (append  (list(list 'delta i 'epsilon (+ f 1))) 
                  (list(create-atom  (first re) (+ f 1)))  
                  (create-seq (rest re) res (+ f 2) (+ f 2))))
        ((and(not(eql(first(first re)) 'star)) 
             (not(eql(first(first re)) 'seq)) 
             (not(eql(first(first re)) 'or)) 
             (not(eql(first (first re)) 'plus)))
         (append  (list(list 'delta i 'epsilon (+ f 1))) 
                  (list(create-atom  (first re) (+ f 1)))  
                  (create-seq (rest re) res (+ f 2) (+ f 2))))
        (T (append (nfa-subregexp-comp  (first re) 
                                        (append '(c) (rest re)) f f) 
                   (create-seq (rest re) res 
                               (cond ((eql (first(first re)) 'seq)
                                      (+ i (conta-stati(first re))))
                                     (T (+ i (conta-stati (first re))))) 
                               (+ f (conta-stati (first re))))))))


;;;create-or/4
(defun create-or (re res i f)
  (cond ((and(eql re nil) (eql res nil)) 
         (nfa-subregexp-comp re res (+ i 3) f))
        ((and(eql re nil) (not(eql res nil))) '())
        ((atom (first re)) 
         (append(list (list 'delta i 'epsilon (+ f 1)) 
                      (list 'delta (+ f 2) 'epsilon (+ i 3)) 
                      (create-atom (first re) (+ f 1))) 
                (create-or (rest re) res i (cond ((equal f i) (+ f 3))
                                                 (T (+ f 2))))))
        ((and(not(eql(first(first re)) 'star)) 
             (not(eql(first(first re)) 'seq)) 
             (not(eql(first(first re)) 'or)) 
             (not(eql(first (first re)) 'plus)))
         (append(list (list 'delta i 'epsilon (+ f 1)) 
                      (list 'delta (+ f 2) 'epsilon (+ i 3)) 
                      (create-atom (first re) (+ f 1))) 
                (create-or (rest re) res i (+ f 3))))
        (T(append (list(list 'delta (cond((eql (first(first re)) 'seq)
                                          (+ f (conta-stati(first re))))
                                         (T (+ f 3))) 'epsilon (+ i 3)))
                  (nfa-subregexp-comp (first re) 
                                      (append '(c) (rest re)) 
                                      i  
                                      f )
                  (create-or (rest re) res i 
                             (+ f (conta-stati (first re))))))))



;;;create-star/4
(defun create-star (re res i f)
  (cond ((and(eql re nil) (eql res nil)) 
         (nfa-subregexp-comp re res i f))
        ((and(eql re nil) (not(eql res nil))) '())
        ((atom (first re)) 
         (append (list (list 'delta i 'epsilon (+ f 1))) 
                 (list(list 'delta (+ f 2) 'epsilon (+ i 3))) 
                 (list(list 'delta i 'epsilon (+ i 3))) 
                 (list(list 'delta (+ f 2) 'epsilon (+ f 1))) 
                 (list(create-atom (first re) (+ f 1)))
                 (create-star (rest re) res (+ i 3) (+ i 3))))
        ((and(not(eql(first(first re)) 'star)) 
             (not(eql(first(first re)) 'seq)) 
             (not(eql(first(first re)) 'or)) 
             (not(eql(first (first re)) 'plus)))
         (append (list (list 'delta i 'epsilon (+ f 1))) 
                 (list(list 'delta (+ f 2) 'epsilon (+ i 3))) 
                 (list(list 'delta i 'epsilon (+ i 3))) 
                 (list(list 'delta (+ f 2) 'epsilon (+ f 1))) 
                 (list(create-atom (first re) (+ f 1)))
                 (create-star (rest re) res (+ i 3) (+ i 3))))
        (T(append (list(list 'delta i 'epsilon (+ f 1))) 
                  (list(list 'delta i 'epsilon 
                             (+ (+ f 1)(conta-stati (first re)) 1))) 
                  (list(list 'delta 
                             (cond((eql (first(first re)) 'seq)
                                   (+ (+ f 1) (conta-stati(first re))))
                                  (T (+ f 4))) 'epsilon 
                             (+ (+ f 1)(conta-stati (first re)) 1)))
                  (list(list 'delta 
                             (cond((eql (first(first re)) 'seq)
                                   (+ (+ f 1) (conta-stati(first re))))
                                  (T (+ f 4))) 'epsilon (+ f 1)))
                  (nfa-subregexp-comp (first re) 
                                      (append '(c) (rest re)) 
                                      (+ f 1) (+ f 1))
                  (create-star (rest re) res 
                               (+ (+ f 1)(conta-stati (first re)) 1) 
                               (+ f (conta-stati (first re))))))))




;;;create-plus/4
(defun create-plus (re res i f)
  (cond ((and(eql re nil) (eql res nil)) 
         (nfa-subregexp-comp re res i f))
        ((and(eql re nil) (not(eql res nil))) '())
        ((atom (first re)) 
         (append (list (list 'delta i 'epsilon (+ f 1))) 
                 (list(list 'delta (+ f 2) 'epsilon (+ i 3)))  
                 (list(list 'delta (+ f 2) 'epsilon (+ f 1))) 
                 (list(create-atom (first re) (+ f 1)))
                 (create-plus (rest re) res (+ i 3) (+ i 3))))
        ((and(not(eql(first(first re)) 'star)) 
             (not(eql(first(first re)) 'seq)) 
             (not(eql(first(first re)) 'or)) 
             (not(eql(first (first re)) 'plus)))
         (append (list (list 'delta i 'epsilon (+ f 1))) 
                 (list(list 'delta (+ f 2) 'epsilon (+ i 3)))  
                 (list(list 'delta (+ f 2) 'epsilon (+ f 1))) 
                 (list(create-atom (first re) (+ f 1)))
                 (create-plus (rest re) res (+ i 3) (+ i 3))))
        (T(append (list(list 'delta i 'epsilon (+ f 1))) 
                  (list(list 'delta 
                             (cond((eql (first(first re)) 'seq)
                                   (+ (+ f 1) (conta-stati(first re))))
                                  (T (+ f 4))) 'epsilon 
                             (+ (+ f 1)(conta-stati (first re)) 1)))
                  (list(list 'delta 
                             (cond((eql (first(first re)) 'seq)
                                   (+ (+ f 1) (conta-stati(first re))))
                                  (T (+ f 4))) 'epsilon (+ f 1)))
                  (nfa-subregexp-comp (first re) 
                                      (append '(c) (rest re)) 
                                      (+ f 1) (+ f 1))
                  (create-plus (rest re) res 
                               (+ (+ f 1)(conta-stati (first re)) 1) 
                               (+ f (conta-stati (first re))))))))

         
;;;create-atom/2
(defun create-atom (re f)
  (list 'delta f re (+ f 1)))


;;;conta-stati/1
(defun conta-stati (re)
  (cond ((eql re nil) 0)
        ((and (atom re) 
              (not(eql re 'seq)) 
              (not (eql re 'or)) 
              (not (eql re 'star)) (not (eql re 'plus ))) 2)
        ((and(eql (first re) 'seq)(eql(rest re) nil))1)
        ((and(eql (first re) 'or)(eql(rest re) nil))1)
        ((and(atom (first re))(eql (rest re) nil)) 2)
        ((eql (first re) 'seq)  
         (+ (conta-stati (first (rest re))) 
            (conta-stati (append '(seq)(rest (rest re))))))
        ((eql (first re) 'or)  
         (+ (conta-stati (first (rest re))) 
            (conta-stati (append '(or) (rest (rest re))))))
        ((and (eql (first re) 'star) (atom (second re))) 3)
        ((eql (first re) 'star) 
         (+ (conta-stati (first (rest re))) 2))
        ((and (eql (first re) 'plus) (atom (second re))) 3)
        ((eql (first re) 'plus) 
         (+ (conta-stati (first (rest re))) 2))))


;;;nfa-test/2
(defun nfa-test (fa in) 
  (cond ((not(is-automa fa nil))
         (error "non è un automa"))
        (T(nfa-subtest fa fa in (list-test fa fa 'initial nil nil)))))


;;;nfa-subtest/4
(defun nfa-subtest (fa fas in n)
  (cond((and(eql in nil)
            (list-test fa fa 'epsilon '(epsilon) n)
            (list-test fa fa 'final nil n))T)
       (T (or (list-test fa fas (first in) (rest in) n) 
              (list-test fa fas 'epsilon in n)))))


;;;list-test/5
(defun list-test (fa fas in ins n)
  (cond ((and (eql fas nil)(eql (first ins) 'epsilon))T)
        ((eql fas nil) nil)
        ((eql in 'initial) 
         (cond ((eql (first(first fas)) 'initial) (second(first fas)))
               (T (list-test fa (rest fas) 'initial ins n))))
        ((eql in 'final) 
         (cond ((eql (first(first fas)) 'final) (eql (second(first fas)) n))
               (T(list-test fa (rest fas) 'final ins n))))
        ((eql in 'epsilon) 
         (cond ((and (eql (second(first fas)) n)
                     (eql (third(first fas)) 'epsilon))
                (or(nfa-subtest fa fa ins (fourth(first fas)))
                   (nfa-subtest fa (rest fas) ins n)))
               (T(list-test fa (rest fas) in ins n))))
        (T(cond ((and(eql (second(first fas)) n)
                     (equal (third(first fas)) in)) 
                 (nfa-subtest fa fa ins (fourth(first fas))))
                (T (list-test fa (rest fas) in ins n))))))


;;;is-automa/2
(defun is-automa (fa n)
  (cond ((and(eql fa nil) (eql n nil)) nil)
        ((and(eql fa nil) (eql n 1))T)
        ((atom fa) nil)
        ((atom (first fa)) nil)
        ((eql (first(first fa)) 'initial) (is-automa (rest fa) 1))
        ((eql (first(first fa)) 'delta) (is-automa (rest fa) 1))
        ((eql (first(first fa)) 'final) (is-automa (rest fa) 1))))



;;; end of file -- nfa.lisp


           
