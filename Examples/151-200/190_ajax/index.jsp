<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Index Page</h1>

    <hr>

    <p>
        Enter your name: <input type="text" id="user_name">
    </p>

    <button id="btn">Send Request</button>

    <script>
        let btn = document.querySelector('#btn');
        let user_name = document.querySelector('#user_name');

        let sendRequest = async () => {
            let response = await fetch('send.do?name='+user_name.value);
            let result = await response.text();

            return result;
        };

        btn.addEventListener('click', () => {
            sendRequest().then((data)=>{
                console.log(data);
            }).catch((error)=>{
                console.log(error);
            });
        });
    </script>
</body>
</html>