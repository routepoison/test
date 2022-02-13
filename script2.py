import sys
import click

"""THIS IS WHERE THE SCRIPT STARTS"""
''' import network module '''
from netmiko import ConnectHandler

''' device information - UPDATE THIS INFORMATION'''
device = {
    'device_type':'cisco_ios',
    'ip':'192.168.1.100',
    'username':'grs',
    'password':'b0n3sb0n3sb0n3s',
}

''' Standard CLI commands as items in list'''
vlan20 = ["vlan 20", "int range fa1/0/2 - 48", "description THIS PORT IS VLAN 20", "switchport mode access", "switchport access vlan 20"]
''' add all commands into one list '''
# vlans = vlan20 + vlan30

''' print function '''
# print("\n\n *** Configuring vlan 20 for interface g1/0/1 - 3 and vlan 30 for interface g1/0/4 - 10 *** \n\n")

''' netmiko establishses connection and executes configuration '''
connect = ConnectHandler(**device)
output = connect.send_config_set(vlan20)

print("\n\n *** Netmiko Python Script Execution completed *** \n\n")