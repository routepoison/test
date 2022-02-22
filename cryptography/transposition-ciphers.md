# Transposition Ciphers

For transposition ciphers, we don't replace the letters by other symbols, but change the order in which they appear on the cleartext.

For example, a simple encryption algorithm simply moves the letters to the right and overlaps. Encrypting the word _pico_ by rotating its letters by one position to the right:

**clear text**: p i c o
**encrypted text**: o p i c

This is a very simple kind of transposition, but you can have a map that makes more complicated transpositions.

Transposition and substitution ciphers work, but used by only themselves, they are very easy to crack. Also, once someone solves the algorithm we use to encrypt, the encryption is broken forever. One way to improve this, is by using encryption algorithms based on a key.

---
