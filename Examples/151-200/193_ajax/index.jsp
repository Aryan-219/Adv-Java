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

    <button id="btn">Send Request</button>

    <hr>

    <select id="names"></select>

    <script>
        let btn = document.querySelector('#btn');
        let names = document.querySelector('#names');
        
        let collectNames = async () => {
            let response = await fetch('send.do');
            let result = await response.json();

            return result;
        };

        btn.addEventListener('click', () => {
            collectNames().then((data)=>{
                // console.log(data);
                // let arr = JSON.parse(data);

                for(let next of data) {
                    let opt = document.createElement('option');
                    opt.innerText = next+' -';
                    names.append(opt);
                }
            }).catch((err)=>{
                console.log(error);
            });
        });
    </script>
</body>
</html>