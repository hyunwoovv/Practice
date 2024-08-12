from flask import Flask
#flask 초기화
app =Flask(__name__)

```
function home(){
    return 'hello world'

}
```

@app.route(/home)
def home();
    a = 10
    print (a)
    return 'hello web'

# 서버구동
# flask 기본 포트 : 5000
app.run(port=5000, debug=True)