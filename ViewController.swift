//
//  ViewController.swift
//  Test App
//
//  Created by Santosh on 07/04/18.
//  Copyright © 2018 Santosh. All rights reserved.
//

import UIKit

class ViewController: UIViewController {
    let a:Int = 25
    var b:Int = 21
    var name = "Santosh"
    var isAnimal = false
    let httpErrorCode = (404,"Not Found")
    override func viewDidLoad() {
        super.viewDidLoad()
        b = 28
        name = name + " Nisal"
        print("My name is \(name)")
        
        if(isAnimal) {
            print("Dog is an Animal")
        }
        else {
          print("Cat is a Pet")
        }
        let(statusCode , serverError) = httpErrorCode
        print("status code is \(statusCode)")
        print("status message is \(serverError)")
        // Do any additional setup after loading the view, typically from a nib.
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }


}

