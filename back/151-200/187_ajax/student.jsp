<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <style>
        #msg {
            color: green;
            font-weight: bold;
            font-size: 34px;
            font-family: verdana;
            display: none;
        }

        #records {
            width: 60%;
        }

        .records {
            border: 1px solid #777;
            margin: 50px auto;            
            font-family: verdana;
            font-size: 24px;
            border-collapse: collapse;
        }

        .records td, .records th {
            border: 1px solid #777;
            border-collapse: collapse;
            padding: 8px;
        }

        #records th {
            background-color: #777;
            color: #fff;
        }

        .action_img {
            height: 24px;
            margin-right: 12px;
            cursor: pointer;
        }
    </style>
</head>
<body>
    <h1>Student Page</h1>

    <hr>

    <div id="msg">Student record is saved..</div>
    <form action="#">
        <table class="records">
            <tr>
                <th>Name</th>
                <td>
                    <input type="text" id="name">
                </td>
            </tr>
            <tr>
                <th>College</th>
                <td>
                    <input type="text" id="college">
                </td>
            </tr>
            <tr>
                <th>Degree</th>
                <td>
                    <input type="text" id="degree">
                </td>
            </tr>
            <tr>
                <th>Branch</th>
                <td>
                    <input type="text" id="branch">
                </td>
            </tr>
            <tr>
                <th>Semester</th>
                <td>
                    <input type="number" id="semester">
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="button" value="Save" id="save">
                </td>
            </tr>
        </table>
    </form>

    <hr>

    <div style="text-align: center">
        <button id="show_btn">Show All Students</button>
    </div>

    <hr>

    <table class="records" id="records">
        <thead>
            <tr>
                <th>Sr.No.</th>
                <th>Name</th>
                <th>College</th>
                <th>Degree</th>
                <th>Branch</th>
                <th>Semester</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody id="records_box"></tbody>
    </table>

    <script src="js/student.js">
        
    </script>
</body>
</html>