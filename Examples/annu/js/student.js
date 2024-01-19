const stname = document.querySelector("#name");
const email = document.querySelector("#email");
const college = document.querySelector("#college");
const degree = document.querySelector("#degree");
const branch = document.querySelector("#branch");
const semester = document.querySelector("#semester");

const btn = document.querySelector("#btn");


// Event on button to save the data in MySQL
btn.addEventListener('click', async () => {
    let studentObject = {
        studentName: stname.value,
        studentEmail: email.value,
        studentCollege: college.value,
        studentDegree: degree.value,
        studentBranch: branch.value,
        studentSem: semester.value
    }

    let params = JSON.stringify(studentObject);

    await fetch("save.do", {
        method: 'POST',
        headers: {
            "Content-Type": "application/x-www-form-urlencoded",
        },
        body: params,
    }).then(async(resp) => {
        let result = resp.text();
        console.log(result);
    }).catch((error) => {
        console.log(error);
    })

    // let resp = await req.text();
    // resp.then((res) => {
    //     console.log(res);
    // }).catch((error) => {
    //     console.log(error);
    // })

    // req.then(async (res) => {
    //     let result = await res.text();
    //     console.log(result);
    // })
});