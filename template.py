import getpass
from netmiko import ConnectHandler

user = raw_input("Enter your TACACS: ")
p = getpass.getpass()

# Functions setup 

def anyconnect(): 
	ip = open("ipaddress.txt", "r").read()
	ip = ip.split("\n")
	for x in ip:
		net_connect = ConnectHandler(device_type='cisco_ios', ip=ip, username=user, password=p, global_delay_factor=.5, secret=p)
		test = net_connect.send_command("show ip interface brief")
		print(test)
		print("!")
		print("!")
		print("!")
		print("!")
		net_connect.disconnect()
		