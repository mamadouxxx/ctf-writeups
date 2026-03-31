with open('apk_raw/classes.dex', 'rb') as f:
    data = f.read()

idx = data.find(b'src/main/proto/scribe.proto')
chunk = data[idx:idx+2000]
printable = ''.join(chr(b) if 32 <= b < 127 else '\n' for b in chunk)
print(printable)
