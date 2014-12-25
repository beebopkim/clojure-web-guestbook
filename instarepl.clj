;; Anything you type in here will be executed
;; immediately with the results shown on the
;; right.
(use 'guestbook.repl)

(start-server)

;(use 'guestbook.models.db)

;(create-guestbook-table)

(ns-unmap 'user 'save-message)
(use 'guestbook.models.db)

(save-message "Bob" "하하하")

(read-guests)
