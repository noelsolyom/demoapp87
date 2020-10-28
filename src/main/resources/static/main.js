async function welcome() {
    let nameModel = {
        'name' : document.getElementById('nameBox').value
    };
    
    console.log(nameModel);
    
    let response = await fetch('/welcome', {
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(nameModel)
    });
    if (response.ok) {
        let data = await response.json();
        alert(data.resp);
        document.getElementById('nameBox').value = '';
    } else {
        let error = await response.json();
        alert(error.message);
    }
}