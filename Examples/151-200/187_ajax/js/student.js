let save = document.querySelector('#save');
let msg = document.querySelector('#msg');
let show_btn = document.querySelector('#show_btn');
let records_box = document.querySelector('#records_box');
let form = document.forms[0];

let name = document.querySelector('#name');
let college = document.querySelector('#college');
let degree = document.querySelector('#degree');
let branch = document.querySelector('#branch');
let semester = document.querySelector('#semester');

//Mentos Zindagi: Note Mentos mat khana
save.addEventListener('click', () => {
    let req = new XMLHttpRequest();

    let studentObject = {name: name.value, college: college.value, degree: degree.value, branch: branch.value, sem: semester.value};
    // let params = 'name=' + name.value + '&college=' + college.value + '&degree=' + degree.value + '&branch=' + branch.value + '&semester=' + semester.value;
    // let params = `name=${name.value}&college=${college.value}&degree=${degree.value}&branch=${branch.value}&semester=${semester.value}`;
    
    let params = JSON.stringify(studentObject);
    console.log(params);

    req.open('post', 'student.do', true);
    req.setRequestHeader('content-type', 'application/x-www-form-urlencoded');

    req.addEventListener('readystatechange', () => {
        if(req.readyState == 4 && req.status == 200) {
            console.log(req.responseText);
            if(req.responseText == 'true') {
                msg.style.display = 'block';
                form.reset();
            }
        }
    });

    req.send(`params=${params}`);
});

show_btn.addEventListener('click', () => {
    let req = new XMLHttpRequest();

    req.open('get', 'show.do', true);

    req.addEventListener('readystatechange', () => {
        if(req.readyState == 4 && req.status == 200) {
            let recs = JSON.parse(req.responseText);

            records_box.innerHTML = null;

            let i = 0;
            for(let student of recs) {
                let row = records_box.insertRow(i++);
                
                let j = 0;
                for(let prop in student) {
                    let cell = row.insertCell(j++);
                    if(j-1==0)
                        cell.innerHTML = i;
                    else
                        cell.innerHTML = student[prop];
                }

                let cell = row.insertCell(j);

                let del_img = document.createElement('img');
                del_img.src = 'images/del.png';
                del_img.className = 'action_img';
                del_img.rowIndex = row.rowIndex;
                del_img.addEventListener('click', (ev) => {
                    let req = new XMLHttpRequest();
                    // console.log('++++', ev.target.parentNode.parentNode);
                    req.row = ev.target.parentNode.parentNode;
                    
                    req.open('get', 'del.do?student_id='+student.studentId, true);
                    
                    req.addEventListener('readystatechange', () => {
                        if(req.readyState == 4 && req.status == 200) {
                            // console.log(req.responseText);

                            if(req.responseText == 'true') {
                                records_box.deleteRow(req.row.rowIndex-1);
                            }
                        }
                    });

                    req.send(null);
                });
                cell.append(del_img);

                let edit_img = document.createElement('img');
                edit_img.src = 'images/edit.png';
                edit_img.className = 'action_img';
                edit_img.addEventListener('click', (ev) => {
                    let parentRow = ev.target.parentNode.parentNode;
                    // console.log(parentRow.cells[0].innerText);
                    // console.log(parentRow.cells[1].innerText);
                    // console.log(parentRow.cells[2].innerText);
                    // console.log(parentRow.cells[3].innerText);
                    // console.log(parentRow.cells[4].innerText);
                    // console.log(parentRow.cells[5].innerText);

                    // console.log(form.elements[0]);
                    form.elements[0].value = parentRow.cells[1].innerText;
                    form.elements[1].value = parentRow.cells[2].innerText;
                    form.elements[2].value = parentRow.cells[3].innerText;
                    form.elements[3].value = parentRow.cells[4].innerText;
                    form.elements[4].value = parentRow.cells[5].innerText;
                });
                cell.append(edit_img);
            }
        }
    });

    req.send();
});