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

    <button id="btn">Show Records</button>

    <table border="1" align="center" id="city_table">
        <tr>
            <th>City Id</th>
            <th>City Name</th>
        </tr>
    </table>

    <script>
        let btn = document.querySelector('#btn');
        let city_table = document.getElementById('city_table');

        btn.addEventListener('click', ()=>{
            let req = new XMLHttpRequest();

            req.open('GET', 'records.do', true);

            req.addEventListener('readystatechange', () => {
                console.log(req.readyState);

                if(req.readyState == 4 && req.status == 200) {  
                    let json = JSON.parse(req.responseText);

                    for(let city of json) {
                        let row = document.createElement('tr');
                        
                        for(let prop in city) {

                            let col = document.createElement('td');
                            col.innerHTML = city[prop];

                            row.append(col);
                        }

                        city_table.append(row);
                    }
                }
            });

            req.send();
        });
    </script>

</body>
</html>