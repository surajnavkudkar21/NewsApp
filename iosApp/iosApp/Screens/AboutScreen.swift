//
//  AboutScreen.swift
//  iosApp
//
//  Created by Suraj Navkudkar on 02/01/25.
//  Copyright © 2025 orgName. All rights reserved.
//

import SwiftUI

struct AboutScreen: View {
    @Environment(\.dismiss)
    private var dismiss
    
    var body: some View {
        NavigationStack {
            AboutListView()
                .navigationTitle("About Device")
                .toolbar{
                    ToolbarItem(placement: .primaryAction){
                        Button {
                            dismiss()
                        }label: {
                            Text("Done").bold()
                        }
                    }
                }
        }
    }
}

#Preview {
    AboutScreen()
}
