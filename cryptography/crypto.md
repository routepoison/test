# Cryptography

Cryptography can assists in achieving many properties or features:

* confidentiality: no one unintended will be able to read the message
* integrity: if a message is tampered, it is possible to detect what it is
* authentication: the identity of a person can be verified accurately
* nonrepudiation: if a person sent a specific message, then the person cannot deny that the message was sent by them

## Compressing and Encrypting files

### Standard Compression

> zip -r my_info.zip my_info/

### Compression with Encryption

This will ask you to encrypt the compression with a password.

> zip --encrypt -r my_protected_info.zip my_info/

### Unzip the compression

Unzip the standard compressed .zip:

> unzip my_info.zip

Unzip the encrypted .zip:

> unzip my_protected_info.zip

## 5.2 Substitution Ciphers

The usual introduction to ciphers is it's definition, followed by ROT.

Invented in the antique Rome and named after emperor Julius Caesar who used it for his private communications is Caesar's cipher. The cipher substitutes each of the letters of a word by another one that is a certain number of positions futher in the alphabet. The 'certain number of positions' is called the shift.

Here's an example of Caesar's with a shift of 3:

**cleartext** --> 'hello'
**encrypted text** --> 'khoor'

'Decrypting' means obtaining the clear text from the encrypted text. So in this case we would do the same three positions in reverse. 

Caesar's cipher is a **substitution cipher**, because it replaces each letter by something else. That means you're not limited to replace a letter with another letter. You can use symbols or anything you'd like if you know how to reverse it.

## Caesar's Cipher in Python

```python
# Caesar's Cipher in Python
def caesar_encrypt(text):
    result = ""
#
    for i in range(len(text)):
        char_position = ord(text[i])
        char_position = char_position - 97
        new_char_position = char_position + 3
        new_char_position = new_char_position % 26
        new_char_position = new_char_position + 97

        result = result + chr(new_char_position)
        print(result)
    return result
#
def caesar_decrypt(cipher_text):
    result = ""
    for i in range(len(cipher_text)):
        char_position = ord(cipher_text[i])
        char_position = char_position - 97
        new_char_position = char_position -3
        new_char_position = new_char_position % 26
        new_char_position = new_char_position + 97
        result = result + chr(new_char_position)
        print(result)
    return(result)
text = 'picoctf'
print(f"Plain Text: {text}")
cipher_text = caesar_encrypt(text)
print(f"Encrypted: {cipher_text}")
print(f"Decrypted: {caesar_decrypt(cipher_text)}")
#
# EOF
#
```

---
