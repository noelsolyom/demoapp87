async function welcome() {
    let nameModel = {
        'name' : document.getElementById('nameBox').value,
        'dt' : new Date()
    };
    
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
        listGuests();
    } else {
        let error = await response.json();
        alert(error.message);
    }
}

async function listGuests() {
	let list = document.getElementById('list');
	list.innerHTML = '';
    let response = await fetch('/welcome');
    if (response.ok) {
        let data = await response.json();
        drawGuests(data);
    } else {
        let error = await response.json();
        alert('error');
    }
}

function drawGuests(guestList) {
	let list = document.getElementById('list');
	
	for(i in guestList) {
		let div = document.createElement('div');
		div.innerHTML = guestList[i].id + ": " + guestList[i].name + ", on " + new Date(guestList[i].dt).toUTCString() + " from " + guestList[i].ip;
		list.appendChild(div);
	}
}

listGuests();