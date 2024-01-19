let save = document.querySelector('#save');
let msg = document.querySelector('#msg');
let show_btn = document.querySelector('#show_btn');
let records_box = document.querySelector('#records_box');
let form = document.forms[0];

let stname = document.querySelector('#name');
let email = document.querySelector('#email');
let college = document.querySelector('#college');
let degree = document.querySelector('#degree');
let branch = document.querySelector('#branch');
let semester = document.querySelector('#semester');
let student_id = document.querySelector('#student_id');

// console.log(form.elements.length)

//Mentos Zindagi: Note Mentos mat khana
let studentObject = '';

let addActionControls = (row, j, studentId) => {
    let cell = row.insertCell(j);

    let del_img = document.createElement('img');
    del_img.src = 'images/del.png';
    del_img.className = 'action_img';
    del_img.rowIndex = row.rowIndex;
    del_img.addEventListener('click', (ev) => {
        let req = new XMLHttpRequest();
        // console.log('++++', ev.target.parentNode.parentNode);
        req.row = ev.target.parentNode.parentNode;
        
        req.open('get', 'del.do?student_id='+studentId, true);
        
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
        
        for(let i=0;i<form.elements.length-1;i++)
            form.elements[i].value = parentRow.cells[i+1].innerText;

        form.elements[6].value = 'Update'; 
        
        student_id.value = studentId;
    });

    cell.append(edit_img);
};

save.addEventListener('click', () => {
    let req = new XMLHttpRequest();

    studentObject = {name: stname.value, email: email.value, college: college.value, degree: degree.value, branch: branch.value, sem: semester.value};
    // let params = 'name=' + name.value + '&college=' + college.value + '&degree=' + degree.value + '&branch=' + branch.value + '&semester=' + semester.value;
    // let params = `name=${name.value}&college=${college.value}&degree=${degree.value}&branch=${branch.value}&semester=${semester.value}`;
    
    let params = JSON.stringify(studentObject);
    console.log(params);
    // console.log(encodeURIComponent(params));

    req.open('post', 'student.do', true);
    req.setRequestHeader('content-type', 'application/x-www-form-urlencoded');

    req.addEventListener('readystatechange', () => {
        if(req.readyState == 4 && req.status == 200) {
            console.log(req.responseText);
            if(req.responseText != '0') {
                let student_id = parseInt(req.responseText);

                msg.style.display = 'block';

                let row = records_box.insertRow(records_box.rows.length);
                row.st_id = student_id;

                let i = 1;
                let cell = row.insertCell(0);
                cell.innerText = records_box.rows.length;
                for(let prop in studentObject) {
                    let cell = row.insertCell(i++);
                    cell.innerText = studentObject[prop];
                }

                addActionControls(row, i, student_id);

                form.reset();
            }
        }
    });
    console.log(form.elements[6].value=='Save'?true:false + "++++++++++++++");

    req.send(`params=${params}&save=${form.elements[6].value=='Save'?true:false}&st_id=${student_id.value}`);
});

let showStudents = () => {
    let req = new XMLHttpRequest();

    req.open('get', 'show.do', true);

    req.addEventListener('readystatechange', () => {
        if(req.readyState == 4 && req.status == 200) {
            let recs = JSON.parse(req.responseText);

            records_box.innerHTML = null;

            let i = 0;
            for(let student of recs) {
                let row = records_box.insertRow(i++);
                row.st_id = student.studentId;
                
                let j = 0;
                for(let prop in student) {
                    let cell = row.insertCell(j++);
                    if(j-1==0)
                        cell.innerHTML = i;
                    else
                        cell.innerHTML = student[prop];
                }

                //-------------------
                // addActionControls(row, j, student.studentId);
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
                    
                    for(let i=0;i<form.elements.length-1;i++)
                        form.elements[i].value = parentRow.cells[i+1].innerText;
                    // form.elements[1].value = parentRow.cells[2].innerText;
                    // form.elements[2].value = parentRow.cells[3].innerText;
                    // form.elements[3].value = parentRow.cells[4].innerText;
                    // form.elements[4].value = parentRow.cells[5].innerText;
                    form.elements[6].value = 'Update';
                    student_id.value = parentRow.st_id;
                });
                cell.append(edit_img);
            }
        }
    });

    req.send();
};

show_btn.addEventListener('click', showStudents);

showStudents();