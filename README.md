# Hotel Management System

The Hotel Management System is a comprehensive and efficient Spring Boot application designed to streamline hotel operations, manage reservations, and enhance the overall guest experience.


## Features

### Guest 
Maintain a centralized database of guest information, providing quick access to details such as guest names, contact information, and visit history.


### Rooms 
Efficiently manage room inventory, including room types, availability, and pricing.


### Reservation
Streamline the check-in and check-out processes for guests, ensuring a seamless experience. Generate invoices, update room status, and handle key guest interactions with ease.


## Endpoints
### Admin 
Admin has the access rights to all the availabe methods in the system


> `endpoint` - "/api/guest/get" <br>
`function` - Get all the Guest Details <br>

> `endpoint` - "/api/guest/get/**" <br>
`function` - Get particular guest details <br>

> `endpoint` - "/api/guest/delete/**" <br>
`function` - Delete particular Guest <br>

> `endpoint` - "/api/guest/put/**" <br>
`function` - Update particular Guest <br>

> `endpoint` - "/api/reserve/get" <br>
`function` - Get all Reservation Details <br>


### Hotel Manager and Admin
Manager has access to maximum methods but only in certainity


> `endpoint` - "/api/guest/post" <br>
`function` - Add a guest <br>

> `endpoint` - "/api/room/post" <br>
`function` - Add Room <br>

> `endpoint` - "/api/room/get" <br>
`function` - Get all Rooms <br>

> `endpoint` - "/api/room/available" <br>
`function` - Get all unoccupied rooms <br>

> `endpoint` - "/api/room/put/**" <br>
`function` - Update Room <br>

> `endpoint` - "/api/reserve/post"" <br>
`function` - Add Reservation <br>

> `endpoint` - "api/reserve/close/**" <br>
`function` - Close Reservation


